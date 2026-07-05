package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public interface f1 {
    Queue A();

    void B(m mVar);

    t5 C();

    m D();

    h7 E(f4 f4Var);

    void F(String str);

    k1 G();

    Map H();

    void I();

    List J();

    void K(j5 j5Var);

    io.sentry.protocol.e L();

    m M(e4 e4Var);

    String N();

    void O(g4 g4Var);

    void P(io.sentry.protocol.w wVar);

    void Q(r1 r1Var);

    List R();

    io.sentry.protocol.i0 S();

    List T();

    String U();

    io.sentry.protocol.r a();

    p1 c();

    void clear();

    f1 clone();

    void d(String str, Boolean bool);

    void e(io.sentry.protocol.i0 i0Var);

    void f(String str, String str2);

    List getAttachments();

    Map getExtras();

    void i(Throwable th, i7 i7Var, String str);

    void j(g gVar, n0 n0Var);

    io.sentry.protocol.j k();

    io.sentry.protocol.w n();

    void o(List list);

    void p(String str, String str2);

    void q(io.sentry.protocol.w wVar);

    w6 r();

    r1 s();

    void t(String str);

    h7 u();

    io.sentry.internal.debugmeta.c v();

    void w(t5 t5Var);

    void x();

    io.sentry.featureflags.c y();

    h7 z();
}
