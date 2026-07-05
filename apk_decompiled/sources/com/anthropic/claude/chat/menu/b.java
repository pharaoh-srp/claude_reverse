package com.anthropic.claude.chat.menu;

import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import defpackage.a2g;
import defpackage.jx2;
import defpackage.rwe;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final rwe a;

    public b(rwe rweVar) {
        this.a = rweVar;
    }

    public final void a() {
        this.a.E.m(new jx2(1, ChatItemMenuDialogDestination.Delete.INSTANCE), new a2g(19));
    }

    public final void b() {
        this.a.E.m(new jx2(2, ChatItemMenuDialogDestination.Rename.INSTANCE), new a2g(20));
    }
}
