package com.xhstormr.app

import java.io.File

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Usage: pacman <dir> <url> <pkg>")
        return
    }

    val dir = File(args[0])

    val url = args[1]

    val name = args[2]

    val packages = dir.walk()
            .filter { it.isFile }
            .map { Package(it) }
            .toSet()

    val depends = mutableSetOf<Package>()

    trace(packages, depends, name)

    depends.forEach { println(url + it.filename) }
}

fun trace(packages: Set<Package>, depends: MutableSet<Package>, name: String) {
    println("Searching for $name")
    val pkg = packages.first { it.provide(name) }
    depends.add(pkg)
    pkg.depends.forEach { trace(packages, depends, it) }
}

/*
https://github.com/Alexpux/MSYS2-pacman/blob/master/test/pacman/pmdb.py
*/
