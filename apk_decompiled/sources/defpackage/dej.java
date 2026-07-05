package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dej {
    public static awi a(qh9 qh9Var) {
        try {
            return new awi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Crash", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Crash", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Crash", e3);
            return null;
        }
    }
}
