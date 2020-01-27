package com.xhstormr.app

data class PackageVersion(val pkgVersion: String) {
    val version = pkgVersion.substringBefore('-')
    val revision = pkgVersion.substringAfter('-')
}
