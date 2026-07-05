package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class q4c implements k99 {
    public static final q4c a;
    public static final wph b;
    public static final rl c;

    static {
        q4c q4cVar = new q4c();
        a = q4cVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b = new wph(timeUnit.toNanos(jCurrentTimeMillis), timeUnit.toNanos(jCurrentTimeMillis), 0L, 0L);
        c = new rl(q4cVar);
    }

    @Override // defpackage.k99
    public final long A() {
        return 0L;
    }

    @Override // defpackage.k99
    public final void B(p0j p0jVar) {
    }

    @Override // defpackage.k99
    public final wph a() {
        return b;
    }

    @Override // defpackage.k99
    public final void b() {
    }

    @Override // defpackage.k99
    public final void c(String str, String str2, Map map) {
        str.getClass();
    }

    @Override // defpackage.k99
    public final void d(if7 if7Var) {
        dch.H(c, 5, g99.E, new k2c(1, (qog) if7Var), null, true, 40);
    }

    @Override // defpackage.k99
    public final void e(String str, vf7 vf7Var) {
        str.getClass();
    }

    @Override // defpackage.k99
    public final List f() {
        return lm6.E;
    }

    @Override // defpackage.k99
    public final a1c g() {
        return new a1c(12, null, null, null, null, null, null, 126);
    }

    @Override // defpackage.k99
    public final gbf getFeature(String str) {
        str.getClass();
        dch.H(c, 5, g99.E, new rb1(str, 19), null, true, 40);
        return null;
    }

    @Override // defpackage.k99
    public final String getName() {
        return "no-op";
    }

    @Override // defpackage.k99
    public final void h(l4i l4iVar) {
    }

    @Override // defpackage.k99
    public final void i(p0j p0jVar) {
        p0jVar.getClass();
    }

    @Override // defpackage.k99
    public final Long j() {
        return null;
    }

    @Override // defpackage.k99
    public final boolean k() {
        return false;
    }

    @Override // defpackage.k99
    public final long l() {
        return 0L;
    }

    @Override // defpackage.k99
    public final ScheduledExecutorService m(String str) {
        return new o4c();
    }

    @Override // defpackage.k99
    public final void n(String str) {
        str.getClass();
    }

    @Override // defpackage.k99
    public final void o(UUID uuid) {
    }

    @Override // defpackage.k99
    public final void p(bz7 bz7Var, String str, boolean z) {
    }

    @Override // defpackage.k99
    public final String q() {
        return "";
    }

    @Override // defpackage.k99
    public final void r(byte[] bArr) {
    }

    @Override // defpackage.k99
    public final void s(long j) {
    }

    @Override // defpackage.k99
    public final h99 t() {
        return c;
    }

    @Override // defpackage.k99
    public final lj5 u(Set set) {
        set.getClass();
        return null;
    }

    @Override // defpackage.k99
    public final hr5 v() {
        return new hr5(0);
    }

    @Override // defpackage.k99
    public final ExecutorService w(String str) {
        return new n4c();
    }

    @Override // defpackage.k99
    public final ExecutorService x() {
        return new n4c();
    }

    @Override // defpackage.k99
    public final iuj y() {
        return new uu5();
    }

    @Override // defpackage.k99
    public final qh9 z() {
        return null;
    }
}
