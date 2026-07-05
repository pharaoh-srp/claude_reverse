package io.sentry;

import defpackage.eb1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a7 extends eb1 {
    public static final List u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;
    public Double d;
    public Double e;
    public z6 f;
    public int g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public io.sentry.protocol.u l;
    public boolean m;
    public o4 n;
    public boolean o;
    public List p;
    public List q;
    public boolean r;
    public List s;
    public List t;

    public final void A(Double d) {
        if (p.q(d, true)) {
            this.e = d;
        } else {
            e0.d(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public final void B(Double d) {
        if (p.q(d, true)) {
            this.d = d;
        } else {
            e0.d(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    @Override // defpackage.eb1
    public final void h(boolean z) {
        if (!z) {
            k();
        }
        super.h(z);
    }

    @Override // defpackage.eb1
    public final void i(boolean z) {
        if (!z) {
            k();
        }
        super.i(z);
    }

    @Override // defpackage.eb1
    public final void k() {
        if (this.c) {
            return;
        }
        this.c = true;
        p.a("ReplayCustomMasking");
    }

    public final List l() {
        return this.p;
    }

    public final List m() {
        return this.q;
    }

    public final List n() {
        return this.s;
    }

    public final List o() {
        return this.t;
    }

    public final Double p() {
        return this.e;
    }

    public final Double q() {
        return this.d;
    }

    public final boolean r() {
        return this.o;
    }

    public final boolean s() {
        return this.r;
    }

    public final void t(boolean z) {
        this.o = z;
    }

    public final void u(boolean z) {
        this.m = z;
    }

    public final void v(boolean z) {
        this.r = z;
    }

    public final void w(ArrayList arrayList) {
        this.p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void x(ArrayList arrayList) {
        this.q = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void y(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void z(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }
}
