package com.anthropic.claude.api.mcp;

import com.anthropic.claude.api.mcp.DirectoryServer;
import defpackage.bsg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final String a(DirectoryServer directoryServer) {
        directoryServer.getClass();
        DirectoryServer.RemoteDetails remote = directoryServer.getRemote();
        if (remote != null) {
            return remote.getUrl();
        }
        return null;
    }

    public static final String b(DirectoryServer directoryServer) {
        directoryServer.getClass();
        String display_name = directoryServer.getDisplay_name();
        if (display_name != null) {
            if (bsg.I0(display_name)) {
                display_name = null;
            }
            if (display_name != null) {
                return display_name;
            }
        }
        return directoryServer.getName();
    }

    public static final boolean c(DirectoryServer directoryServer) {
        String strA;
        directoryServer.getClass();
        return (directoryServer.getType() != DirectoryServerType.REMOTE || (strA = a(directoryServer)) == null || bsg.I0(strA)) ? false : true;
    }
}
