package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pwj {
    public static exi a(qh9 qh9Var) {
        try {
            return new exi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Resource", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Resource", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Resource", e3);
            return null;
        }
    }

    public abstract long b();
}
