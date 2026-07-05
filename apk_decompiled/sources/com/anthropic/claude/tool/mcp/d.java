package com.anthropic.claude.tool.mcp;

import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ d(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return PromptsFrame._childSerializers$_anonymous_();
            case 1:
                return ResourcesFrame._childSerializers$_anonymous_();
            case 2:
                return ServerBaseFrame._childSerializers$_anonymous_();
            case 3:
                return ServerListFrame._childSerializers$_anonymous_();
            default:
                return ToolsFrame._childSerializers$_anonymous_();
        }
    }
}
