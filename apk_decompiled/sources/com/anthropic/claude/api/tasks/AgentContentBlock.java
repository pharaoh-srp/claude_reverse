package com.anthropic.claude.api.tasks;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\u0005¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/tasks/AgentContentBlock;", "", "Companion", "Text", "Thinking", "kq", "com/anthropic/claude/api/tasks/a", "Lcom/anthropic/claude/api/tasks/AgentContentBlock$Text;", "Lcom/anthropic/claude/api/tasks/AgentContentBlock$Thinking;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface AgentContentBlock {
    public static final a Companion = a.a;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/tasks/AgentContentBlock$Text;", "Lcom/anthropic/claude/api/tasks/AgentContentBlock;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/AgentContentBlock$Text;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/tasks/AgentContentBlock$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/api/tasks/b", "com/anthropic/claude/api/tasks/c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Text implements AgentContentBlock {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String text;

        public /* synthetic */ Text(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.text = "";
            } else {
                this.text = str;
            }
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        public static final /* synthetic */ void write$Self$api(Text self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && x44.r(self.text, "")) {
                return;
            }
            output.q(serialDesc, 0, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String text) {
            text.getClass();
            return new Text(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && x44.r(this.text, ((Text) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ij0.j("Text(text=", this.text, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Text() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Text(String str) {
            str.getClass();
            this.text = str;
        }

        public /* synthetic */ Text(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/tasks/AgentContentBlock$Thinking;", "Lcom/anthropic/claude/api/tasks/AgentContentBlock;", "", "thinking", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/AgentContentBlock$Thinking;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/tasks/AgentContentBlock$Thinking;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getThinking", "Companion", "com/anthropic/claude/api/tasks/d", "com/anthropic/claude/api/tasks/e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Thinking implements AgentContentBlock {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String thinking;

        public /* synthetic */ Thinking(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.thinking = "";
            } else {
                this.thinking = str;
            }
        }

        public static /* synthetic */ Thinking copy$default(Thinking thinking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = thinking.thinking;
            }
            return thinking.copy(str);
        }

        public static final /* synthetic */ void write$Self$api(Thinking self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && x44.r(self.thinking, "")) {
                return;
            }
            output.q(serialDesc, 0, self.thinking);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getThinking() {
            return this.thinking;
        }

        public final Thinking copy(String thinking) {
            thinking.getClass();
            return new Thinking(thinking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Thinking) && x44.r(this.thinking, ((Thinking) other).thinking);
        }

        public final String getThinking() {
            return this.thinking;
        }

        public int hashCode() {
            return this.thinking.hashCode();
        }

        public String toString() {
            return ij0.j("Thinking(thinking=", this.thinking, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Thinking() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Thinking(String str) {
            str.getClass();
            this.thinking = str;
        }

        public /* synthetic */ Thinking(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
