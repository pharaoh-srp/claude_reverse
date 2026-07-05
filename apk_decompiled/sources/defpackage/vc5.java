package defpackage;

import com.anthropic.claude.api.notice.Cta;
import com.anthropic.claude.api.notice.CtaIntent;
import com.anthropic.claude.api.notice.RedirectHint;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vc5 implements w28 {
    public static final vc5 a;
    private static final SerialDescriptor descriptor;

    static {
        vc5 vc5Var = new vc5();
        a = vc5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notice.Cta", vc5Var, 3);
        pluginGeneratedSerialDescriptor.j("copy", true);
        pluginGeneratedSerialDescriptor.j("intent", true);
        pluginGeneratedSerialDescriptor.j("redirect_hint", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, yc5.d, d4c.S(x9e.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        CtaIntent ctaIntent = null;
        RedirectHint redirectHint = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                ctaIntent = (CtaIntent) ud4VarC.l(serialDescriptor, 1, yc5.d, ctaIntent);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                redirectHint = (RedirectHint) ud4VarC.m(serialDescriptor, 2, x9e.d, redirectHint);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Cta(i, strV, ctaIntent, redirectHint, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Cta cta = (Cta) obj;
        encoder.getClass();
        cta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Cta.write$Self$api(cta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
