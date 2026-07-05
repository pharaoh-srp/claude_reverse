package com.anthropic.claude.project.details.custominstructions;

import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.emd;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute.EditCustomInstructions", aVar, 2);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("instructions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{emd.a, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1085unboximpl = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ProjectId projectId = (ProjectId) ud4VarC.l(serialDescriptor, 0, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CustomInstructionsDialogRoute.EditCustomInstructions(i, strM1085unboximpl, strV, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CustomInstructionsDialogRoute.EditCustomInstructions editCustomInstructions = (CustomInstructionsDialogRoute.EditCustomInstructions) obj;
        encoder.getClass();
        editCustomInstructions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CustomInstructionsDialogRoute.EditCustomInstructions.write$Self$project(editCustomInstructions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
