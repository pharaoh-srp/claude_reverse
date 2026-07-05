package defpackage;

import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class si1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;
    public final s41 h;
    public final boolean i;
    public final String j;
    public final float k;

    public si1(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, s41 s41Var, boolean z, String str7, float f) {
        str.getClass();
        s41Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
        this.h = s41Var;
        this.i = z;
        this.j = str7;
        this.k = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto Lbe
        L5:
            boolean r1 = r5 instanceof defpackage.si1
            r2 = 0
            if (r1 != 0) goto Lc
            goto Lbd
        Lc:
            si1 r5 = (defpackage.si1) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L1a
            goto Lbd
        L1a:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L26
            if (r1 != 0) goto L24
            r1 = r0
            goto L2d
        L24:
            r1 = r2
            goto L2d
        L26:
            if (r1 != 0) goto L29
            goto L24
        L29:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r1)
        L2d:
            if (r1 != 0) goto L31
            goto Lbd
        L31:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L3d
            if (r1 != 0) goto L3b
            r1 = r0
            goto L44
        L3b:
            r1 = r2
            goto L44
        L3d:
            if (r1 != 0) goto L40
            goto L3b
        L40:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r3, r1)
        L44:
            if (r1 != 0) goto L48
            goto Lbd
        L48:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L54
            if (r1 != 0) goto L52
            r1 = r0
            goto L5b
        L52:
            r1 = r2
            goto L5b
        L54:
            if (r1 != 0) goto L57
            goto L52
        L57:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingEffort.m1138equalsimpl0(r3, r1)
        L5b:
            if (r1 != 0) goto L5f
            goto Lbd
        L5f:
            java.lang.String r1 = r5.e
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L6b
            if (r1 != 0) goto L69
            r1 = r0
            goto L72
        L69:
            r1 = r2
            goto L72
        L6b:
            if (r1 != 0) goto L6e
            goto L69
        L6e:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r3, r1)
        L72:
            if (r1 != 0) goto L75
            goto Lbd
        L75:
            java.util.ArrayList r1 = r4.f
            java.util.ArrayList r3 = r5.f
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L80
            goto Lbd
        L80:
            java.lang.String r1 = r5.g
            java.lang.String r3 = r4.g
            if (r3 != 0) goto L8c
            if (r1 != 0) goto L8a
            r1 = r0
            goto L93
        L8a:
            r1 = r2
            goto L93
        L8c:
            if (r1 != 0) goto L8f
            goto L8a
        L8f:
            boolean r1 = com.anthropic.claude.bell.api.VoiceSelection.m576equalsimpl0(r3, r1)
        L93:
            if (r1 != 0) goto L96
            goto Lbd
        L96:
            s41 r1 = r4.h
            s41 r3 = r5.h
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La1
            goto Lbd
        La1:
            boolean r1 = r4.i
            boolean r3 = r5.i
            if (r1 == r3) goto La8
            goto Lbd
        La8:
            java.lang.String r1 = r4.j
            java.lang.String r3 = r5.j
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto Lb3
            goto Lbd
        Lb3:
            float r4 = r4.k
            float r5 = r5.k
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto Lbe
        Lbd:
            return r2
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM982hashCodeimpl = ChatId.m982hashCodeimpl(this.a) * 31;
        String str = this.b;
        int iM1062hashCodeimpl = (iM982hashCodeimpl + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31;
        String str2 = this.c;
        int iM1083hashCodeimpl = (iM1062hashCodeimpl + (str2 == null ? 0 : ProjectId.m1083hashCodeimpl(str2))) * 31;
        String str3 = this.d;
        int iM1139hashCodeimpl = (iM1083hashCodeimpl + (str3 == null ? 0 : ThinkingEffort.m1139hashCodeimpl(str3))) * 31;
        String str4 = this.e;
        int iHashCode = (this.f.hashCode() + ((iM1139hashCodeimpl + (str4 == null ? 0 : ThinkingMode.m1146hashCodeimpl(str4))) * 31)) * 31;
        String str5 = this.g;
        int iP = fsh.p((this.h.hashCode() + ((iHashCode + (str5 == null ? 0 : VoiceSelection.m577hashCodeimpl(str5))) * 31)) * 31, 31, this.i);
        String str6 = this.j;
        return Float.hashCode(this.k) + ((iP + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.a);
        String str = this.b;
        String strM1063toStringimpl = str == null ? "null" : ModelId.m1063toStringimpl(str);
        String str2 = this.c;
        String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
        String str3 = this.d;
        String strM1140toStringimpl = str3 == null ? "null" : ThinkingEffort.m1140toStringimpl(str3);
        String str4 = this.e;
        String strM1148toStringimpl = str4 == null ? "null" : ThinkingMode.m1148toStringimpl(str4);
        String str5 = this.g;
        String strM578toStringimpl = str5 != null ? VoiceSelection.m578toStringimpl(str5) : "null";
        StringBuilder sbR = kgh.r("BellConnectParams(chatId=", strM983toStringimpl, ", modelId=", strM1063toStringimpl, ", projectId=");
        kgh.u(sbR, strM1084toStringimpl, ", effort=", strM1140toStringimpl, ", thinkingMode=");
        sbR.append(strM1148toStringimpl);
        sbR.append(", tools=");
        sbR.append(this.f);
        sbR.append(", voiceSelection=");
        sbR.append(strM578toStringimpl);
        sbR.append(", encodingTarget=");
        sbR.append(this.h);
        sbR.append(", isTemporary=");
        sbR.append(this.i);
        sbR.append(", language=");
        sbR.append(this.j);
        sbR.append(", ttsSpeed=");
        sbR.append(this.k);
        sbR.append(")");
        return sbR.toString();
    }
}
