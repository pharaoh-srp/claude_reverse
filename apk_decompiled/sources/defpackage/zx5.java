package defpackage;

import com.anthropic.claude.api.chat.DeleteChatsResponse;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zx5 implements w28 {
    public static final zx5 a;
    private static final SerialDescriptor descriptor;

    static {
        zx5 zx5Var = new zx5();
        a = zx5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.DeleteChatsResponse", zx5Var, 2);
        pluginGeneratedSerialDescriptor.j("deleted", true);
        pluginGeneratedSerialDescriptor.j("failed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = DeleteChatsResponse.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DeleteChatsResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Set set = null;
        Set set2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                set = (Set) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), set);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                set2 = (Set) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), set2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DeleteChatsResponse(i, set, set2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DeleteChatsResponse deleteChatsResponse = (DeleteChatsResponse) obj;
        encoder.getClass();
        deleteChatsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DeleteChatsResponse.write$Self$api(deleteChatsResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
