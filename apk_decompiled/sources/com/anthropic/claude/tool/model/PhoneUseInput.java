package com.anthropic.claude.tool.model;

import defpackage.a2d;
import defpackage.b2d;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/PhoneUseInput;", "", "", "task", "task_description", "to_number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/PhoneUseInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/PhoneUseInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTask", "getTask_description", "getTo_number", "Companion", "a2d", "b2d", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PhoneUseInput {
    public static final b2d Companion = new b2d();
    private final String task;
    private final String task_description;
    private final String to_number;

    public /* synthetic */ PhoneUseInput(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, a2d.a.getDescriptor());
            throw null;
        }
        this.task = str;
        this.task_description = str2;
        this.to_number = str3;
    }

    public static /* synthetic */ PhoneUseInput copy$default(PhoneUseInput phoneUseInput, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneUseInput.task;
        }
        if ((i & 2) != 0) {
            str2 = phoneUseInput.task_description;
        }
        if ((i & 4) != 0) {
            str3 = phoneUseInput.to_number;
        }
        return phoneUseInput.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(PhoneUseInput self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.task);
        output.q(serialDesc, 1, self.task_description);
        output.q(serialDesc, 2, self.to_number);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTask() {
        return this.task;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTask_description() {
        return this.task_description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTo_number() {
        return this.to_number;
    }

    public final PhoneUseInput copy(String task, String task_description, String to_number) {
        task.getClass();
        task_description.getClass();
        to_number.getClass();
        return new PhoneUseInput(task, task_description, to_number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneUseInput)) {
            return false;
        }
        PhoneUseInput phoneUseInput = (PhoneUseInput) other;
        return x44.r(this.task, phoneUseInput.task) && x44.r(this.task_description, phoneUseInput.task_description) && x44.r(this.to_number, phoneUseInput.to_number);
    }

    public final String getTask() {
        return this.task;
    }

    public final String getTask_description() {
        return this.task_description;
    }

    public final String getTo_number() {
        return this.to_number;
    }

    public int hashCode() {
        return this.to_number.hashCode() + kgh.l(this.task.hashCode() * 31, 31, this.task_description);
    }

    public String toString() {
        String str = this.task;
        String str2 = this.task_description;
        return ij0.m(kgh.r("PhoneUseInput(task=", str, ", task_description=", str2, ", to_number="), this.to_number, ")");
    }

    public PhoneUseInput(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.task = str;
        this.task_description = str2;
        this.to_number = str3;
    }
}
