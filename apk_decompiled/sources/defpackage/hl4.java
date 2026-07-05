package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hl4 extends v9c {
    public final String c;

    public hl4(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.v9c
    public final w9c a(int i, int i2, Object obj, String str) {
        String string = str.subSequence(i, i2).toString();
        String str2 = this.c;
        if (x44.r(string, str2)) {
            return null;
        }
        return new wg(str2, 13);
    }
}
