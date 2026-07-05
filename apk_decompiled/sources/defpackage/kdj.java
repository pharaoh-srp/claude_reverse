package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kdj implements jdj {
    public final String b;
    public final a49 c;
    public final a49 d;

    public kdj(String str) {
        this.b = str;
        this.c = new a49(str);
        this.d = new a49(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
