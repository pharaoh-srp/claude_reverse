package defpackage;

import com.anthropic.claude.api.account.DocumentAcceptance;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q96 implements w28 {
    public static final q96 a;
    private static final SerialDescriptor descriptor;

    static {
        q96 q96Var = new q96();
        a = q96Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.DocumentAcceptance", q96Var, 2);
        pluginGeneratedSerialDescriptor.j("document_id", false);
        pluginGeneratedSerialDescriptor.j("accepted_via_checkbox", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DocumentAcceptance(i, strV, bool, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DocumentAcceptance documentAcceptance = (DocumentAcceptance) obj;
        encoder.getClass();
        documentAcceptance.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DocumentAcceptance.write$Self$api(documentAcceptance, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
