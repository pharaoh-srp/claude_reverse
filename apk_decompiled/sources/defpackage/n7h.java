package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ToolState;
import com.anthropic.claude.api.chat.ToolStateContentBlock;
import com.anthropic.claude.api.experience.TrackUnknownActionData;
import com.anthropic.claude.api.notification.TestPushCategory;
import com.anthropic.claude.api.notification.TestPushRequest;
import com.anthropic.claude.api.notification.TestPushResponse;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.anthropic.claude.api.tasks.TaskStepStatus;
import com.anthropic.claude.mcpapps.transport.ToolResultParams;
import com.anthropic.claude.mcpapps.transport.ToolsListResult;
import com.anthropic.claude.tasks.ui.TasksListOverlay;
import com.anthropic.claude.tool.model.TaskStatusOutput;
import com.anthropic.claude.tool.model.TaskStatusOutputStatus;
import com.anthropic.claude.tool.model.TaskStatusOutputStepsItemStatus;
import com.anthropic.claude.tool.model.Tool;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import kotlinx.serialization.descriptors.SerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n7h implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ n7h(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return TaskResponse._childSerializers$_anonymous_$0();
            case 1:
                return TaskStatus._init_$_anonymous_();
            case 2:
                return TaskStatusOutput._childSerializers$_anonymous_();
            case 3:
                return TaskStatusOutputStatus._init_$_anonymous_();
            case 4:
                return TaskStatusOutputStepsItemStatus._init_$_anonymous_();
            case 5:
                return TaskStepStatus._init_$_anonymous_();
            case 6:
                return mpk.P("");
            case 7:
                return mpk.P(Boolean.FALSE);
            case 8:
                return mpk.P(null);
            case 9:
                return TasksListOverlay.None._init_$_anonymous_();
            case 10:
                return x44.W(TasksListOverlay.None.INSTANCE);
            case 11:
                return TestPushCategory._init_$_anonymous_();
            case 12:
                return TestPushRequest._childSerializers$_anonymous_();
            case 13:
                return TestPushResponse._childSerializers$_anonymous_();
            case 14:
                xe4 xe4Var = keh.a;
                return null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (bsg.I0("kotlinx.datetime.TimeBased")) {
                    sz6.p("Blank serial names are prohibited");
                    return null;
                }
                oh3 oh3Var = new oh3("kotlinx.datetime.TimeBased");
                xka xkaVar = xka.a;
                oh3Var.a("nanoseconds", xka.b);
                return new jnf("kotlinx.datetime.TimeBased", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
            case 16:
                return Tool.Analysis._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Tool.Artifacts._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Tool.Compass._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Tool.DriveSearch._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return mpk.P(Boolean.FALSE);
            case 21:
                return ToolResultParams._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ToolState._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ToolStateContentBlock._init_$_anonymous_();
            case 24:
                return ToolsListResult._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                qnc qncVar = n2i.a;
                return Boolean.TRUE;
            case 26:
                y5f y5fVar = s2i.d;
                return Boolean.TRUE;
            case 27:
                return TrackUnknownActionData._init_$_anonymous_();
            case 28:
                return UiDemoAppDestination._init_$_anonymous_();
            default:
                x44.E().add(UiDemoAppDestination.HOME);
                throw null;
        }
    }
}
