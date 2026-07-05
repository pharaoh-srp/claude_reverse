package io.sentry;

import defpackage.lf5;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements z0 {
    public final m4 a;

    public r0(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // io.sentry.h1
    public final y0 A() {
        return this.a.f;
    }

    @Override // io.sentry.h1
    public final void B(j4 j4Var) {
        this.a.B(j4Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w D(Exception exc, n0 n0Var) {
        return this.a.J(exc, n0Var, null);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w E(io.sentry.protocol.e0 e0Var, p7 p7Var, n0 n0Var, y3 y3Var) {
        return this.a.E(e0Var, p7Var, n0Var, y3Var);
    }

    @Override // io.sentry.h1
    public final h1 F(String str) {
        return this.a.F("getCurrentScopes");
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w G(io.sentry.protocol.k kVar) {
        return this.a.G(kVar);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w H(t5 t5Var) {
        return this.a.H(t5Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w I(j5 j5Var, n0 n0Var) {
        return this.a.I(j5Var, n0Var);
    }

    @Override // io.sentry.h1
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // io.sentry.h1
    public final void b(long j) {
        this.a.b(j);
    }

    @Override // io.sentry.h1
    public final p1 c() {
        return this.a.c();
    }

    @Override // io.sentry.h1
    /* JADX INFO: renamed from: clone */
    public final z0 m1189clone() {
        return this.a.m1189clone();
    }

    @Override // io.sentry.h1
    public final void d(String str, Boolean bool) {
        this.a.d(str, bool);
    }

    @Override // io.sentry.h1
    public final void e(io.sentry.protocol.i0 i0Var) {
        this.a.e(i0Var);
    }

    @Override // io.sentry.h1
    public final void f(String str, String str2) {
        this.a.f(str, str2);
    }

    @Override // io.sentry.h1
    public final lf5 g() {
        return this.a.g();
    }

    @Override // io.sentry.h1
    public final boolean h() {
        return this.a.h();
    }

    @Override // io.sentry.h1
    public final void i(Throwable th, i7 i7Var, String str) {
        this.a.i(th, i7Var, str);
    }

    @Override // io.sentry.h1
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // io.sentry.h1
    public final void j(g gVar, n0 n0Var) {
        this.a.j(gVar, n0Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        return this.a.k(cVar, n0Var);
    }

    @Override // io.sentry.h1
    public final void m(g gVar) {
        this.a.m(gVar);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w n(v3 v3Var) {
        return this.a.n(v3Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w o(Throwable th, n0 n0Var, j4 j4Var) {
        return this.a.J(th, n0Var, j4Var);
    }

    @Override // io.sentry.h1
    public final void q() {
        this.a.q();
    }

    @Override // io.sentry.h1
    public final w6 r() {
        return this.a.r();
    }

    @Override // io.sentry.h1
    public final r1 s() {
        return this.a.s();
    }

    @Override // io.sentry.h1
    public final r1 t(s7 s7Var, t7 t7Var) {
        return this.a.t(s7Var, t7Var);
    }

    @Override // io.sentry.h1
    public final void u() {
        this.a.u();
    }

    @Override // io.sentry.h1
    public final void v() {
        this.a.v();
    }

    @Override // io.sentry.h1
    public final void w(j4 j4Var) {
        this.a.w(j4Var);
    }

    @Override // io.sentry.h1
    public final Boolean x() {
        return this.a.x();
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w y(y6 y6Var, n0 n0Var) {
        return this.a.y(y6Var, n0Var);
    }

    @Override // io.sentry.h1
    public final f1 z() {
        return this.a.a;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1190clone() {
        return this.a.m1189clone();
    }
}
