package com.anthropic.claude.settings;

import com.anthropic.claude.settings.SettingsAppScreen;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.nmd;
import defpackage.rwe;
import defpackage.u3a;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements bz7 {
    public final /* synthetic */ rwe E;

    public a(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1035unboximpl = ((McpServerId) obj).m1035unboximpl();
        strM1035unboximpl.getClass();
        this.E.E.m(new u3a(14, new SettingsAppScreen.McpServerToolsScreen(strM1035unboximpl, null)), new nmd(8));
        return iei.a;
    }
}
