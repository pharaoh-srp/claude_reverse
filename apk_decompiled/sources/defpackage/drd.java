package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class drd {
    public final bwb a;
    public final String b;

    public drd(bwb bwbVar, String str) {
        str.getClass();
        this.a = bwbVar;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        sz6.j(ij0.m(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }

    public final Object b(Object obj, Object obj2) {
        bwb bwbVar = this.a;
        Object obj3 = bwbVar.get(obj);
        if (obj3 == null) {
            bwbVar.k(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public /* synthetic */ drd(bwb bwbVar) {
        this(bwbVar, bwbVar.getName());
    }
}
