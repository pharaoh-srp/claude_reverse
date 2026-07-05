package defpackage;

import com.anthropic.claude.api.share.ProjectCreator;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qkd implements w28 {
    public static final qkd a;
    private static final SerialDescriptor descriptor;

    static {
        qkd qkdVar = new qkd();
        a = qkdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.share.ProjectCreator", qkdVar, 3);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("full_name", true);
        pluginGeneratedSerialDescriptor.j("email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z7.a, d4c.S(srg.a), d4c.S(ok6.a)};
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
        String strM1013unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 0, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                EmailAddress emailAddress = (EmailAddress) ud4VarC.m(serialDescriptor, 2, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectCreator(i, strM949unboximpl, str, strM1013unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectCreator projectCreator = (ProjectCreator) obj;
        encoder.getClass();
        projectCreator.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectCreator.write$Self$api(projectCreator, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
