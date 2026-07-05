package io.sentry;

import defpackage.lf5;

/* JADX INFO: loaded from: classes.dex */
public final class n4 implements h1 {
    public static final n4 a = new n4();

    @Override // io.sentry.h1
    public final y0 A() {
        return t4.g().A();
    }

    @Override // io.sentry.h1
    public final void B(j4 j4Var) {
        t4.p(j4Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w D(Exception exc, n0 n0Var) {
        return t4.g().D(exc, n0Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w E(io.sentry.protocol.e0 e0Var, p7 p7Var, n0 n0Var, y3 y3Var) {
        return t4.g().E(e0Var, p7Var, n0Var, y3Var);
    }

    @Override // io.sentry.h1
    public final h1 F(String str) {
        return t4.g().F("getCurrentScopes");
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w G(io.sentry.protocol.k kVar) {
        return t4.g().A().e(kVar);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w H(t5 t5Var) {
        return t4.c(t5Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w I(j5 j5Var, n0 n0Var) {
        return t4.g().I(j5Var, n0Var);
    }

    @Override // io.sentry.h1
    public final void a(boolean z) {
        t4.d();
    }

    @Override // io.sentry.h1
    public final void b(long j) {
        t4.f(j);
    }

    @Override // io.sentry.h1
    public final p1 c() {
        return t4.g().c();
    }

    @Override // io.sentry.h1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final z0 m1189clone() {
        return t4.g().m1188clone();
    }

    @Override // io.sentry.h1
    public final void d(String str, Boolean bool) {
        t4.a(str, bool);
    }

    @Override // io.sentry.h1
    public final void e(io.sentry.protocol.i0 i0Var) {
        t4.o(i0Var);
    }

    @Override // io.sentry.h1
    public final void f(String str, String str2) {
        t4.n(str, str2);
    }

    @Override // io.sentry.h1
    public final lf5 g() {
        return t4.g().g();
    }

    @Override // io.sentry.h1
    public final boolean h() {
        return t4.g().h();
    }

    @Override // io.sentry.h1
    public final void i(Throwable th, i7 i7Var, String str) {
        t4.g().i(th, i7Var, str);
    }

    @Override // io.sentry.h1
    public final boolean isEnabled() {
        return t4.l();
    }

    @Override // io.sentry.h1
    public final void j(g gVar, n0 n0Var) {
        t4.g().j(gVar, n0Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        return t4.g().k(cVar, n0Var);
    }

    @Override // io.sentry.h1
    public final void m(g gVar) {
        j(gVar, new n0());
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w n(v3 v3Var) {
        return t4.g().n(v3Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w o(Throwable th, n0 n0Var, j4 j4Var) {
        return t4.g().o(th, n0Var, j4Var);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w p(io.sentry.protocol.k kVar) {
        return t4.g().A().c(kVar);
    }

    @Override // io.sentry.h1
    public final void q() {
        t4.m();
    }

    @Override // io.sentry.h1
    public final w6 r() {
        return t4.g().r();
    }

    @Override // io.sentry.h1
    public final r1 s() {
        return t4.g().s();
    }

    @Override // io.sentry.h1
    public final r1 t(s7 s7Var, t7 t7Var) {
        return t4.g().t(s7Var, t7Var);
    }

    @Override // io.sentry.h1
    public final void u() {
        t4.g().u();
    }

    @Override // io.sentry.h1
    public final void v() {
        t4.g().v();
    }

    @Override // io.sentry.h1
    public final void w(j4 j4Var) {
        t4.e(j4Var);
    }

    @Override // io.sentry.h1
    public final Boolean x() {
        return t4.k();
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w y(y6 y6Var, n0 n0Var) {
        return t4.g().y(y6Var, n0Var);
    }

    @Override // io.sentry.h1
    public final f1 z() {
        return t4.g().z();
    }
}
