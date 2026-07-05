package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vpj {
    public static nwi a(qh9 qh9Var) {
        try {
            return new nwi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Frustration", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Frustration", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Frustration", e3);
            return null;
        }
    }

    public static void b(int i, int i2) {
        String strH;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strH = fok.h("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(grc.p(i2, "negative size: "));
                    return;
                }
                strH = fok.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            xh6.j(e(i, i2, "index"));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? e(i, i3, "start index") : (i2 < 0 || i2 > i3) ? e(i2, i3, "end index") : fok.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String e(int i, int i2, String str) {
        if (i < 0) {
            return fok.h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return fok.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(grc.p(i2, "negative size: "));
        return null;
    }
}
