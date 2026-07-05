package defpackage;

import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.types.strings.SessionId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i34 implements w28 {
    public static final i34 a;
    private static final SerialDescriptor descriptor;

    static {
        i34 i34Var = new i34();
        a = i34Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams", i34Var, 4);
        pluginGeneratedSerialDescriptor.j("sessionId", true);
        pluginGeneratedSerialDescriptor.j("isRootScreen", true);
        pluginGeneratedSerialDescriptor.j("prefill", true);
        pluginGeneratedSerialDescriptor.j("newSessionScope", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(fsf.a), zt1.a, d4c.S(o2c.a), CodeRemoteSessionScreenParams.$childSerializers[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeRemoteSessionScreenParams.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM1120unboximpl = null;
        NewCodeSessionPrefill newCodeSessionPrefill = null;
        CodeSessionListScope codeSessionListScope = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                SessionId sessionId = (SessionId) ud4VarC.m(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                newCodeSessionPrefill = (NewCodeSessionPrefill) ud4VarC.m(serialDescriptor, 2, o2c.a, newCodeSessionPrefill);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                codeSessionListScope = (CodeSessionListScope) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), codeSessionListScope);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeRemoteSessionScreenParams(i, strM1120unboximpl, zU, newCodeSessionPrefill, codeSessionListScope, (vnf) null, (mq5) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeRemoteSessionScreenParams codeRemoteSessionScreenParams = (CodeRemoteSessionScreenParams) obj;
        encoder.getClass();
        codeRemoteSessionScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeRemoteSessionScreenParams.write$Self$remote(codeRemoteSessionScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
