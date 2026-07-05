package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.types.strings.TaskId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
import defpackage.lje;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.z5h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.FormInput", dVar, 3);
        pluginGeneratedSerialDescriptor.j("taskId", false);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("input", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z5h.a, c1i.a, lje.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1134unboximpl = null;
        String strM1163unboximpl = null;
        RequestFormInputFromUserInput requestFormInputFromUserInput = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                TaskId taskId = (TaskId) ud4VarC.l(serialDescriptor, 0, z5h.a, strM1134unboximpl != null ? TaskId.m1128boximpl(strM1134unboximpl) : null);
                strM1134unboximpl = taskId != null ? taskId.m1134unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 1, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                requestFormInputFromUserInput = (RequestFormInputFromUserInput) ud4VarC.l(serialDescriptor, 2, lje.a, requestFormInputFromUserInput);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TasksBottomSheetDestination.FormInput(i, strM1134unboximpl, strM1163unboximpl, requestFormInputFromUserInput, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TasksBottomSheetDestination.FormInput formInput = (TasksBottomSheetDestination.FormInput) obj;
        encoder.getClass();
        formInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TasksBottomSheetDestination.FormInput.write$Self$Claude_tasks(formInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
