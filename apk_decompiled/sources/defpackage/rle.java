package defpackage;

import com.anthropic.claude.types.strings.ResearchMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class rle implements KSerializer {
    public static final rle a = new rle();
    public static final rfd b = j8.h("ResearchMode", kfd.t);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.s06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r4) {
        /*
            r3 = this;
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.zg9
            r0 = 0
            if (r3 == 0) goto L3a
            zg9 r4 = (defpackage.zg9) r4
            kotlinx.serialization.json.JsonElement r3 = r4.n()
            boolean r4 = r3 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r4 == 0) goto L24
            r1 = r3
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            boolean r2 = r1.isString()
            if (r2 == 0) goto L24
            java.lang.String r3 = r1.getContent()
            java.lang.String r3 = com.anthropic.claude.types.strings.ResearchMode.m1094constructorimpl(r3)
            goto L42
        L24:
            if (r4 == 0) goto L31
            r4 = r3
            kotlinx.serialization.json.JsonPrimitive r4 = (kotlinx.serialization.json.JsonPrimitive) r4
            java.lang.Boolean r4 = defpackage.ch9.e(r4)
            if (r4 == 0) goto L31
            r3 = r0
            goto L42
        L31:
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = com.anthropic.claude.types.strings.ResearchMode.m1094constructorimpl(r3)
            goto L42
        L3a:
            java.lang.String r3 = r4.s()
            java.lang.String r3 = com.anthropic.claude.types.strings.ResearchMode.m1094constructorimpl(r3)
        L42:
            if (r3 == 0) goto L49
            com.anthropic.claude.types.strings.ResearchMode r3 = com.anthropic.claude.types.strings.ResearchMode.m1093boximpl(r3)
            return r3
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rle.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResearchMode researchMode = (ResearchMode) obj;
        String strM1099unboximpl = researchMode != null ? researchMode.m1099unboximpl() : null;
        encoder.getClass();
        if (strM1099unboximpl != null) {
            ResearchMode.Companion.getClass();
            if (!ResearchMode.m1096equalsimpl0(strM1099unboximpl, ResearchMode.NONE)) {
                encoder.F(strM1099unboximpl);
                return;
            }
        }
        encoder.e();
    }
}
