package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kbe {
    public final ClassLoader a;

    public jbe a(xd9 xd9Var) {
        Class<?> cls;
        gh3 gh3VarA = xd9Var.a();
        ww7 ww7VarG = gh3VarA.g();
        ww7VarG.getClass();
        String strReplace = gh3VarA.h().b().replace('.', '$');
        strReplace.getClass();
        if (!ww7VarG.d()) {
            strReplace = ww7VarG.b() + '.' + strReplace;
        }
        try {
            cls = Class.forName(strReplace, false, this.a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return new jbe(cls);
        }
        return null;
    }
}
