package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.types.strings.TaskId;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.z5h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.EventInspector", bVar, 1);
        pluginGeneratedSerialDescriptor.j("taskId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z5h.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM1134unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                TaskId taskId = (TaskId) ud4VarC.l(serialDescriptor, 0, z5h.a, strM1134unboximpl != null ? TaskId.m1128boximpl(strM1134unboximpl) : null);
                strM1134unboximpl = taskId != null ? taskId.m1134unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TasksBottomSheetDestination.EventInspector(i, strM1134unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TasksBottomSheetDestination.EventInspector eventInspector = (TasksBottomSheetDestination.EventInspector) obj;
        encoder.getClass();
        eventInspector.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, z5h.a, TaskId.m1128boximpl(eventInspector.taskId));
        vd4VarC.b(serialDescriptor);
    }
}
