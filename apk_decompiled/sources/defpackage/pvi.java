package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pvi {
    public final String a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    public final Boolean r;
    public final Boolean s;
    public final Boolean t;
    public final Boolean u;
    public final Boolean v;

    public pvi(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21) {
        this.a = str;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = bool6;
        this.h = bool7;
        this.i = bool8;
        this.j = bool9;
        this.k = bool10;
        this.l = bool11;
        this.m = bool12;
        this.n = bool13;
        this.o = bool14;
        this.p = bool15;
        this.q = bool16;
        this.r = bool17;
        this.s = bool18;
        this.t = bool19;
        this.u = bool20;
        this.v = bool21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvi)) {
            return false;
        }
        pvi pviVar = (pvi) obj;
        return x44.r(this.a, pviVar.a) && x44.r(this.b, pviVar.b) && x44.r(this.c, pviVar.c) && x44.r(this.d, pviVar.d) && x44.r(this.e, pviVar.e) && x44.r(this.f, pviVar.f) && x44.r(this.g, pviVar.g) && x44.r(this.h, pviVar.h) && x44.r(this.i, pviVar.i) && x44.r(this.j, pviVar.j) && x44.r(this.k, pviVar.k) && x44.r(this.l, pviVar.l) && x44.r(this.m, pviVar.m) && x44.r(this.n, pviVar.n) && x44.r(this.o, pviVar.o) && x44.r(this.p, pviVar.p) && x44.r(this.q, pviVar.q) && x44.r(this.r, pviVar.r) && x44.r(this.s, pviVar.s) && x44.r(this.t, pviVar.t) && x44.r(this.u, pviVar.u) && x44.r(this.v, pviVar.v);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.h;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.i;
        int iHashCode9 = (iHashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.j;
        int iHashCode10 = (iHashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.k;
        int iHashCode11 = (iHashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.l;
        int iHashCode12 = (iHashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.m;
        int iHashCode13 = (iHashCode12 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.n;
        int iHashCode14 = (iHashCode13 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.o;
        int iHashCode15 = (iHashCode14 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.p;
        int iHashCode16 = (iHashCode15 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.q;
        int iHashCode17 = (iHashCode16 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.r;
        int iHashCode18 = (iHashCode17 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.s;
        int iHashCode19 = (iHashCode18 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.t;
        int iHashCode20 = (iHashCode19 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.u;
        int iHashCode21 = (iHashCode20 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.v;
        return iHashCode21 + (bool21 != null ? bool21.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Accessibility(textSize=");
        sb.append(this.a);
        sb.append(", screenReaderEnabled=");
        sb.append(this.b);
        sb.append(", boldTextEnabled=");
        ebh.C(sb, this.c, ", reduceTransparencyEnabled=", this.d, ", reduceMotionEnabled=");
        ebh.C(sb, this.e, ", buttonShapesEnabled=", this.f, ", invertColorsEnabled=");
        ebh.C(sb, this.g, ", increaseContrastEnabled=", this.h, ", assistiveSwitchEnabled=");
        ebh.C(sb, this.i, ", assistiveTouchEnabled=", this.j, ", videoAutoplayEnabled=");
        ebh.C(sb, this.k, ", closedCaptioningEnabled=", this.l, ", monoAudioEnabled=");
        ebh.C(sb, this.m, ", shakeToUndoEnabled=", this.n, ", reducedAnimationsEnabled=");
        ebh.C(sb, this.o, ", shouldDifferentiateWithoutColor=", this.p, ", grayscaleEnabled=");
        ebh.C(sb, this.q, ", singleAppModeEnabled=", this.r, ", onOffSwitchLabelsEnabled=");
        ebh.C(sb, this.s, ", speakScreenEnabled=", this.t, ", speakSelectionEnabled=");
        sb.append(this.u);
        sb.append(", rtlEnabled=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
