package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionFilterSelected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sv3 implements w28 {
    public static final sv3 a;
    private static final SerialDescriptor descriptor;

    static {
        sv3 sv3Var = new sv3();
        a = sv3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.session_filter.selected", sv3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "filter_bucket", false, "bucket_count", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$SessionFilterSelected(i, strV, strV2, iR, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$SessionFilterSelected codeEvents$SessionFilterSelected = (CodeEvents$SessionFilterSelected) obj;
        encoder.getClass();
        codeEvents$SessionFilterSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$SessionFilterSelected.write$Self$analytics(codeEvents$SessionFilterSelected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
