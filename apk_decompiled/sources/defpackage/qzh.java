package defpackage;

import com.anthropic.claude.types.strings.ToolSearchMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class qzh implements KSerializer {
    public static final qzh a = new qzh();
    public static final rfd b = j8.h("ToolSearchMode", kfd.t);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.s06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r1 = r2 instanceof defpackage.zg9
            r0 = 0
            if (r1 == 0) goto L25
            zg9 r2 = (defpackage.zg9) r2
            kotlinx.serialization.json.JsonElement r1 = r2.n()
            boolean r2 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r2 == 0) goto L23
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            boolean r2 = r1.isString()
            if (r2 == 0) goto L23
            java.lang.String r1 = r1.getContent()
            java.lang.String r1 = com.anthropic.claude.types.strings.ToolSearchMode.m1151constructorimpl(r1)
            goto L2d
        L23:
            r1 = r0
            goto L2d
        L25:
            java.lang.String r1 = r2.s()
            java.lang.String r1 = com.anthropic.claude.types.strings.ToolSearchMode.m1151constructorimpl(r1)
        L2d:
            if (r1 == 0) goto L34
            com.anthropic.claude.types.strings.ToolSearchMode r1 = com.anthropic.claude.types.strings.ToolSearchMode.m1150boximpl(r1)
            return r1
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzh.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolSearchMode toolSearchMode = (ToolSearchMode) obj;
        String strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
        encoder.getClass();
        if (strM1156unboximpl != null) {
            ToolSearchMode.Companion.getClass();
            if (!ToolSearchMode.m1153equalsimpl0(strM1156unboximpl, ToolSearchMode.AUTO)) {
                encoder.F(strM1156unboximpl);
                return;
            }
        }
        encoder.e();
    }
}
