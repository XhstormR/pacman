package com.xhstormr.app

import java.io.BufferedReader
import java.io.File

class Package(path: File) {
    lateinit var arch: String
    lateinit var name: String
    lateinit var desc: String
    lateinit var filename: String
    lateinit var pkgVersion: PackageVersion
    var groups = emptyList<String>()
    var depends = emptyList<String>()
    var provides = emptyList<String>()

    init {
        path.bufferedReader().use {
            while (true) {
                val line = it.readLine() ?: break
                when (line) {
                    "%ARCH%" -> arch = it.readLine()
                    "%NAME%" -> name = it.readLine()
                    "%DESC%" -> desc = it.readLine()
                    "%FILENAME%" -> filename = it.readLine()
                    "%VERSION%" -> pkgVersion = PackageVersion(it.readLine())
                    "%GROUPS%" -> groups = getSection(it)
                    "%DEPENDS%" -> depends = getSection(it)
                    "%PROVIDES%" -> provides = getSection(it)
                }
            }
        }
    }

    companion object {
        const val MINGW_PREFIX = "mingw-w64-x86_64-"
    }

    fun provide(name: String) = when {
        this.name == name -> true
        this.name == name.substringBefore('=') -> true
        this.name == name.substringBefore(">=") -> true
        provides.contains(name) -> true
        else -> false
    }

    private fun getSection(reader: BufferedReader): List<String> {
        val list = mutableListOf<String>()
        while (true) {
            val line = reader.readLine()
            if (line.isEmpty()) break
            list.add(line)
        }
        return list
    }
}
