package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yw7 extends v9c {
    public final int c;
    public final int d;
    public final drd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw7(int i, int i2, drd drdVar, String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str);
        drdVar.getClass();
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = drdVar;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + str + ": expected 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            StringBuilder sb = new StringBuilder("Invalid maximum length ");
            sb.append(i2);
            sb.append(" for field ");
            sb.append(str);
            sb.append(": expected ");
            mr9.q(vb7.l(i, "..9", sb));
            throw null;
        }
    }

    @Override // defpackage.v9c
    public final w9c a(int i, int i2, Object obj, String str) {
        int i3 = i2 - i;
        int i4 = this.c;
        if (i3 < i4) {
            return new x9c(i4, 6);
        }
        int i5 = this.d;
        if (i3 > i5) {
            return new x9c(i5, 7);
        }
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        Object objB = this.e.b(obj, new ao5(iCharAt, i3));
        if (objB == null) {
            return null;
        }
        return new g6(objB);
    }
}
