package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpened;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pu3 implements w28 {
    public static final pu3 a;
    private static final SerialDescriptor descriptor;

    static {
        pu3 pu3Var = new pu3();
        a = pu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.pull_request.opened", pu3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", true, "entry_point", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$PullRequestOpened.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$PullRequestOpened.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$PullRequestOpenEntryPoint = (CodeEvents$PullRequestOpenEntryPoint) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), codeEvents$PullRequestOpenEntryPoint);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$PullRequestOpened(i, strV, str, codeEvents$PullRequestOpenEntryPoint, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$PullRequestOpened codeEvents$PullRequestOpened = (CodeEvents$PullRequestOpened) obj;
        encoder.getClass();
        codeEvents$PullRequestOpened.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$PullRequestOpened.write$Self$analytics(codeEvents$PullRequestOpened, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
