package dev.nucleusframework.composenativetray.utils

import dev.nucleusframework.composenativetray.lib.linux.LinuxNativeBridge

fun isLinuxTrayHostRegistered(): Boolean =
    try {
        LinuxNativeBridge.nativeHostRegistered()
    } catch (_: UnsatisfiedLinkError) {
        false
    }
