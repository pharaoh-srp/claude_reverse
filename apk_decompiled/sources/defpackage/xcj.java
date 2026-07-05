package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class xcj {
    public static final bdj b;
    public final bdj a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new mcj() : i >= 35 ? new lcj() : i >= 34 ? new kcj() : i >= 31 ? new jcj() : i >= 30 ? new icj() : i >= 29 ? new hcj() : new fcj()).b().a.a().a.b().a.c();
    }

    public xcj(bdj bdjVar) {
        this.a = bdjVar;
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public bdj a() {
        return this.a;
    }

    public bdj b() {
        return this.a;
    }

    public bdj c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(bdj bdjVar) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcj)) {
            return false;
        }
        xcj xcjVar = (xcj) obj;
        return t() == xcjVar.t() && s() == xcjVar.s() && Objects.equals(n(), xcjVar.n()) && Objects.equals(l(), xcjVar.l()) && Objects.equals(h(), xcjVar.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public j86 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public f59 i(int i) {
        return f59.e;
    }

    public f59 j(int i) {
        if ((i & 8) == 0) {
            return f59.e;
        }
        sz6.p("Unable to query the maximum insets for IME");
        return null;
    }

    public f59 k() {
        return n();
    }

    public f59 l() {
        return f59.e;
    }

    public f59 m() {
        return n();
    }

    public f59 n() {
        return f59.e;
    }

    public f59 o() {
        return n();
    }

    public void p(View view) {
    }

    public void q() {
    }

    public bdj r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void v(s86 s86Var) {
    }

    public void w(f59[] f59VarArr) {
    }

    public void x(f59 f59Var) {
    }

    public void y(bdj bdjVar) {
    }

    public void z(f59 f59Var) {
    }
}
