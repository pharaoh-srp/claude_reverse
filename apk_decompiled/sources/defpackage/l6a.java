package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l6a extends b5c {
    public String g;
    public String h;

    public l6a(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.b5c
    public final void a(xjk xjkVar) {
        xjkVar.y(this);
    }

    @Override // defpackage.b5c
    public final String h() {
        return "destination=" + this.g + ", title=" + this.h;
    }
}
