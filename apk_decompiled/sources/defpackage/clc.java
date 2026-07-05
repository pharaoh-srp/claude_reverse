package defpackage;

import com.anthropic.claude.sessions.types.GitInfoType;
import com.anthropic.claude.sessions.types.OutcomeGitInfo;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class clc implements w28 {
    public static final clc a;
    private static final SerialDescriptor descriptor;

    static {
        clc clcVar = new clc();
        a = clcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.OutcomeGitInfo", clcVar, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("repo", false);
        pluginGeneratedSerialDescriptor.j("branches", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = OutcomeGitInfo.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), srg.a, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = OutcomeGitInfo.$childSerializers;
        boolean z = true;
        int i = 0;
        GitInfoType gitInfoType = null;
        String strV = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                gitInfoType = (GitInfoType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), gitInfoType);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new OutcomeGitInfo(i, gitInfoType, strV, list, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OutcomeGitInfo outcomeGitInfo = (OutcomeGitInfo) obj;
        encoder.getClass();
        outcomeGitInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        OutcomeGitInfo.write$Self$sessions(outcomeGitInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
