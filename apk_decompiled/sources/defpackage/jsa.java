package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jsa {
    public static esa a(Object obj, Object obj2) {
        esa esaVar = (esa) obj;
        esa esaVar2 = (esa) obj2;
        if (!esaVar2.isEmpty()) {
            if (!esaVar.E) {
                if (esaVar.isEmpty()) {
                    esaVar = new esa();
                } else {
                    esa esaVar3 = new esa(esaVar);
                    esaVar3.E = true;
                    esaVar = esaVar3;
                }
            }
            esaVar.c();
            if (!esaVar2.isEmpty()) {
                esaVar.putAll(esaVar2);
            }
        }
        return esaVar;
    }
}
