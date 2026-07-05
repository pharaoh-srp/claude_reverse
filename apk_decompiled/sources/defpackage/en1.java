package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.bell.BellModeService;
import com.anthropic.claude.bell.VoiceSessionSummary;

/* JADX INFO: loaded from: classes2.dex */
public final class en1 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final v0 j;
    public final d7 k;
    public lj1 l;
    public BellModeService m;
    public v0 n;
    public boolean o;
    public boolean p;
    public final amg q;
    public final amg r;
    public boolean s;
    public VoiceSessionSummary t;

    public en1(Context context, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, v0 v0Var, d7 d7Var) {
        context.getClass();
        str.getClass();
        str6.getClass();
        str7.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = str7;
        this.j = v0Var;
        this.k = d7Var;
        amg amgVarA = bmg.a(null);
        this.q = amgVarA;
        this.r = amgVarA;
    }

    public final amg a() {
        return this.r;
    }

    public final void b() {
        lj1 lj1Var = this.l;
        if (lj1Var != null) {
            this.a.unbindService(lj1Var);
            this.q.m(null);
            this.m = null;
            this.l = null;
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        if (this.p) {
            this.s = false;
            this.t = null;
            this.p = false;
        }
        if (x44.x(this.a, "android.permission.RECORD_AUDIO") != 0) {
            this.k.a();
            return;
        }
        v0 v0Var = new v0(17, this);
        this.n = v0Var;
        bz7 bz7Var = BellModeService.T;
        BellModeService.T = v0Var;
        Intent intent = new Intent(this.a, (Class<?>) BellModeService.class);
        this.a.startForegroundService(intent);
        int i = 1;
        if (this.l == null) {
            this.l = new lj1(i, this);
        }
        Context context = this.a;
        lj1 lj1Var = this.l;
        lj1Var.getClass();
        context.bindService(intent, lj1Var, 1);
    }
}
