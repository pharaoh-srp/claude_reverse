package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pvc implements Serializable {
    public final String E;
    public final transient u0e F;

    public pvc(String str, u0e u0eVar) {
        this.E = str;
        this.F = u0eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0494, code lost:
    
        r7.c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x049f, code lost:
    
        throw new com.google.re2j.PatternSyntaxException("invalid character class range", r7.i());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Type inference failed for: r13v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pvc a(java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvc.a(java.lang.String):pvc");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && pvc.class == obj.getClass() && this.E.equals(((pvc) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode() * 31;
    }

    public final String toString() {
        return this.E;
    }
}
