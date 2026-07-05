package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class w8i {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public bfh r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(w8i w8iVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (w8iVar != null) {
            if (!this.c && w8iVar.c) {
                this.b = w8iVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = w8iVar.h;
            }
            if (this.i == -1) {
                this.i = w8iVar.i;
            }
            if (this.a == null && (str = w8iVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = w8iVar.f;
            }
            if (this.g == -1) {
                this.g = w8iVar.g;
            }
            if (this.n == -1) {
                this.n = w8iVar.n;
            }
            if (this.o == null && (alignment2 = w8iVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = w8iVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = w8iVar.q;
            }
            if (this.j == -1) {
                this.j = w8iVar.j;
                this.k = w8iVar.k;
            }
            if (this.r == null) {
                this.r = w8iVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = w8iVar.s;
            }
            if (this.t == null) {
                this.t = w8iVar.t;
            }
            if (this.u == null) {
                this.u = w8iVar.u;
            }
            if (!this.e && w8iVar.e) {
                this.d = w8iVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = w8iVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
