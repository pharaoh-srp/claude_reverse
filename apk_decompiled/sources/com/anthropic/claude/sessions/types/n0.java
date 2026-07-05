package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.Outcome;
import defpackage.clc;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 implements w28 {
    public static final n0 a;
    private static final SerialDescriptor descriptor;

    static {
        n0 n0Var = new n0();
        a = n0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("git_repository", n0Var, 1);
        pluginGeneratedSerialDescriptor.j("git_info", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{clc.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        OutcomeGitInfo outcomeGitInfo = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                outcomeGitInfo = (OutcomeGitInfo) ud4VarC.l(serialDescriptor, 0, clc.a, outcomeGitInfo);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Outcome.GitRepository(i, outcomeGitInfo, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Outcome.GitRepository gitRepository = (Outcome.GitRepository) obj;
        encoder.getClass();
        gitRepository.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Outcome.GitRepository.write$Self$sessions(gitRepository, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
