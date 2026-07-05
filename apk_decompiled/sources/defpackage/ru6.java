package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ru6 extends av6 {
    public static boolean b = false;
    public final /* synthetic */ int a;

    public /* synthetic */ ru6(int i) {
        this.a = i;
    }

    @Override // defpackage.av6
    public int a() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    @Override // defpackage.av6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.yj6 r9, defpackage.yj6 r10) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru6.b(yj6, yj6):boolean");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return ">";
        }
    }
}
