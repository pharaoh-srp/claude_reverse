package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wzi {
    public final xzi a;
    public final tzi b;
    public final b0j c;

    public wzi(xzi xziVar, tzi tziVar, b0j b0jVar) {
        this.a = xziVar;
        this.b = tziVar;
        this.c = b0jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzi)) {
            return false;
        }
        wzi wziVar = (wzi) obj;
        return this.a.equals(wziVar.a) && this.b.equals(wziVar.b) && this.c.equals(wziVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 29791);
    }

    public final String toString() {
        return "Dd(session=" + this.a + ", configuration=" + this.b + ", browserSdkVersion=null, sdkName=null, profiling=" + this.c + ")";
    }
}
