package defpackage;

import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import com.anthropic.claude.bell.tts.d;

/* JADX INFO: loaded from: classes2.dex */
public final class i2h {
    public volatile double a;
    public volatile long b;
    public volatile long c;
    public volatile int d;
    public volatile d e;
    public volatile int f;
    public volatile boolean g;
    public volatile Double h;
    public volatile ReadAloudEvents$ReadAloudInterruptReason i;
    public volatile boolean j;

    public final int a() {
        return this.f;
    }

    public final boolean b() {
        return this.j;
    }

    public final ReadAloudEvents$ReadAloudInterruptReason c() {
        return this.i;
    }

    public final Double d() {
        return this.h;
    }

    public final long e() {
        return this.b;
    }

    public final double f() {
        return this.a;
    }

    public final long g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public final boolean i() {
        return this.g;
    }

    public final d j() {
        return this.e;
    }

    public final void k(int i) {
        this.f = i;
    }

    public final void l() {
        this.j = true;
    }

    public final void m(ReadAloudEvents$ReadAloudInterruptReason readAloudEvents$ReadAloudInterruptReason) {
        this.i = readAloudEvents$ReadAloudInterruptReason;
    }

    public final void n(Double d) {
        this.h = d;
    }

    public final void o(long j) {
        this.b = j;
    }

    public final void p(long j) {
        this.c = j;
    }

    public final void q(int i) {
        this.d = i;
    }
}
