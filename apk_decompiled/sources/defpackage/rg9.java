package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rg9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final ch3 j;
    public final boolean k;

    public rg9(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, boolean z7, ch3 ch3Var, boolean z8) {
        str.getClass();
        str2.getClass();
        ch3Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = str;
        this.h = str2;
        this.i = z7;
        this.j = ch3Var;
        this.k = z8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.b);
        sb.append(", isLenient=");
        sb.append(this.c);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.d);
        sb.append(", prettyPrint=");
        sb.append(this.e);
        sb.append(", explicitNulls=");
        sb.append(this.f);
        sb.append(", prettyPrintIndent='");
        sb.append(this.g);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.h);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.i);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.j);
        sb.append(", exceptionsWithDebugInfo=");
        return y6a.p(sb, this.k, ')');
    }
}
