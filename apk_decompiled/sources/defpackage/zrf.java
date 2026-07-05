package defpackage;

import com.anthropic.claude.sessions.types.SessionGroupingMember;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zrf implements w28 {
    public static final zrf a;
    private static final SerialDescriptor descriptor;

    static {
        zrf zrfVar = new zrf();
        a = zrfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionGroupingMember", zrfVar, 4);
        pluginGeneratedSerialDescriptor.j("account_id", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("avatar_url", true);
        pluginGeneratedSerialDescriptor.j("joined_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(g69.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        c69 c69Var = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                c69Var = (c69) ud4VarC.m(serialDescriptor, 3, g69.a, c69Var);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SessionGroupingMember(i, str, str2, str3, c69Var, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionGroupingMember sessionGroupingMember = (SessionGroupingMember) obj;
        encoder.getClass();
        sessionGroupingMember.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionGroupingMember.write$Self$sessions(sessionGroupingMember, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
