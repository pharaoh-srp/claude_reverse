package defpackage;

import com.anthropic.claude.api.project.ProjectActorAccount;
import com.anthropic.claude.types.strings.AccountId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kkd implements w28 {
    public static final kkd a;
    private static final SerialDescriptor descriptor;

    static {
        kkd kkdVar = new kkd();
        a = kkdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.ProjectActorAccount", kkdVar, 2);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("full_name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z7.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM949unboximpl = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 0, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectActorAccount(i, strM949unboximpl, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectActorAccount projectActorAccount = (ProjectActorAccount) obj;
        encoder.getClass();
        projectActorAccount.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectActorAccount.write$Self$api(projectActorAccount, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
