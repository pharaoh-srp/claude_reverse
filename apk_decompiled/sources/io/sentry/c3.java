package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements f1 {
    public static final c3 b = new c3();
    public final io.sentry.util.h a = new io.sentry.util.h(new b2(2));

    public static c3 b() {
        return b;
    }

    @Override // io.sentry.f1
    public final Queue A() {
        return new ArrayDeque();
    }

    @Override // io.sentry.f1
    public final void B(m mVar) {
    }

    @Override // io.sentry.f1
    public final t5 C() {
        return null;
    }

    @Override // io.sentry.f1
    public final m D() {
        return new m();
    }

    @Override // io.sentry.f1
    public final h7 E(f4 f4Var) {
        return null;
    }

    @Override // io.sentry.f1
    public final void F(String str) {
    }

    @Override // io.sentry.f1
    public final k1 G() {
        return g3.a;
    }

    @Override // io.sentry.f1
    public final Map H() {
        return new HashMap();
    }

    @Override // io.sentry.f1
    public final void I() {
    }

    @Override // io.sentry.f1
    public final List J() {
        return new ArrayList();
    }

    @Override // io.sentry.f1
    public final void K(j5 j5Var) {
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.e L() {
        return new io.sentry.protocol.e();
    }

    @Override // io.sentry.f1
    public final m M(e4 e4Var) {
        return new m();
    }

    @Override // io.sentry.f1
    public final String N() {
        return null;
    }

    @Override // io.sentry.f1
    public final void O(g4 g4Var) {
    }

    @Override // io.sentry.f1
    public final void P(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.f1
    public final void Q(r1 r1Var) {
    }

    @Override // io.sentry.f1
    public final List R() {
        return new ArrayList();
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.i0 S() {
        return null;
    }

    @Override // io.sentry.f1
    public final List T() {
        return new ArrayList();
    }

    @Override // io.sentry.f1
    public final String U() {
        return null;
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.r a() {
        return null;
    }

    @Override // io.sentry.f1
    public final p1 c() {
        return null;
    }

    @Override // io.sentry.f1
    public final void clear() {
    }

    @Override // io.sentry.f1
    public final f1 clone() {
        return b;
    }

    @Override // io.sentry.f1
    public final void d(String str, Boolean bool) {
    }

    @Override // io.sentry.f1
    public final void e(io.sentry.protocol.i0 i0Var) {
    }

    @Override // io.sentry.f1
    public final void f(String str, String str2) {
    }

    @Override // io.sentry.f1
    public final List getAttachments() {
        return new ArrayList();
    }

    @Override // io.sentry.f1
    public final Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.f1
    public final void i(Throwable th, i7 i7Var, String str) {
    }

    @Override // io.sentry.f1
    public final void j(g gVar, n0 n0Var) {
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.j k() {
        return null;
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.w n() {
        return io.sentry.protocol.w.F;
    }

    @Override // io.sentry.f1
    public final void o(List list) {
    }

    @Override // io.sentry.f1
    public final void p(String str, String str2) {
    }

    @Override // io.sentry.f1
    public final void q(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.f1
    public final w6 r() {
        return (w6) this.a.a();
    }

    @Override // io.sentry.f1
    public final r1 s() {
        return null;
    }

    @Override // io.sentry.f1
    public final void t(String str) {
    }

    @Override // io.sentry.f1
    public final h7 u() {
        return null;
    }

    @Override // io.sentry.f1
    public final io.sentry.internal.debugmeta.c v() {
        return null;
    }

    @Override // io.sentry.f1
    public final void w(t5 t5Var) {
    }

    @Override // io.sentry.f1
    public final void x() {
    }

    @Override // io.sentry.f1
    public final io.sentry.featureflags.c y() {
        return io.sentry.featureflags.d.E;
    }

    @Override // io.sentry.f1
    public final h7 z() {
        return null;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1182clone() {
        return b;
    }
}
