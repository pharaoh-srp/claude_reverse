package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.db.ClaudeDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends cl6 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ cve e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll3(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    @Override // defpackage.cl6
    public final void a(lze lzeVar) {
        int i = this.d;
        lzeVar.getClass();
        switch (i) {
            case 0:
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `cachedMessages` (`uuid` TEXT NOT NULL, `conversation_uuid` TEXT NOT NULL, `message_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_cachedMessages_conversation_uuid` ON `cachedMessages` (`conversation_uuid`)");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `cachedConversations` (`uuid` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `conversation_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `chatIdListEntries` (`source` TEXT NOT NULL, `chat_uuid` TEXT NOT NULL, PRIMARY KEY(`source`, `chat_uuid`))");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `cachedProjects` (`uuid` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `project_json` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `projectIdListEntries` (`source` TEXT NOT NULL, `project_uuid` TEXT NOT NULL, PRIMARY KEY(`source`, `project_uuid`))");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                u00.r(lzeVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ececdabd77ce97aad46cb1041bc15fd9')");
                break;
            default:
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                u00.r(lzeVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                u00.r(lzeVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // defpackage.cl6
    public final void b(lze lzeVar) {
        int i = this.d;
        lzeVar.getClass();
        switch (i) {
            case 0:
                u00.r(lzeVar, "DROP TABLE IF EXISTS `cachedMessages`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `cachedConversations`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `chatIdListEntries`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `cachedProjects`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `projectIdListEntries`");
                break;
            default:
                u00.r(lzeVar, "DROP TABLE IF EXISTS `Dependency`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `WorkSpec`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `WorkTag`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `WorkName`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `WorkProgress`");
                u00.r(lzeVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // defpackage.cl6
    public final void c(lze lzeVar) {
        int i = this.d;
        lzeVar.getClass();
    }

    @Override // defpackage.cl6
    public final void d(lze lzeVar) throws Exception {
        int i = this.d;
        cve cveVar = this.e;
        lzeVar.getClass();
        switch (i) {
            case 0:
                ((ClaudeDatabase_Impl) cveVar).m(lzeVar);
                break;
            default:
                u00.r(lzeVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) cveVar).m(lzeVar);
                break;
        }
    }

    @Override // defpackage.cl6
    public final void e(lze lzeVar) {
        int i = this.d;
        lzeVar.getClass();
    }

    @Override // defpackage.cl6
    public final void f(lze lzeVar) throws Exception {
        int i = this.d;
        lzeVar.getClass();
        switch (i) {
            case 0:
                mvk.e(lzeVar);
                break;
            default:
                mvk.e(lzeVar);
                break;
        }
    }

    @Override // defpackage.cl6
    public final jf g(lze lzeVar) throws Exception {
        int i = this.d;
        lzeVar.getClass();
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("uuid", new k3h(1, 1, "uuid", "TEXT", null, true));
                linkedHashMap.put("conversation_uuid", new k3h(0, 1, "conversation_uuid", "TEXT", null, true));
                linkedHashMap.put("message_json", new k3h(0, 1, "message_json", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new m3h("index_cachedMessages_conversation_uuid", false, x44.W("conversation_uuid"), x44.W("ASC")));
                n3h n3hVar = new n3h("cachedMessages", linkedHashMap, linkedHashSet, linkedHashSet2);
                n3h n3hVarI = zjk.i(lzeVar, "cachedMessages");
                if (n3hVar.equals(n3hVarI)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("uuid", new k3h(1, 1, "uuid", "TEXT", null, true));
                    linkedHashMap2.put("updated_at", new k3h(0, 1, "updated_at", "INTEGER", null, true));
                    linkedHashMap2.put("conversation_json", new k3h(0, 1, "conversation_json", "TEXT", null, true));
                    n3h n3hVar2 = new n3h("cachedConversations", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                    n3h n3hVarI2 = zjk.i(lzeVar, "cachedConversations");
                    if (n3hVar2.equals(n3hVarI2)) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("source", new k3h(1, 1, "source", "TEXT", null, true));
                        linkedHashMap3.put("chat_uuid", new k3h(2, 1, "chat_uuid", "TEXT", null, true));
                        n3h n3hVar3 = new n3h("chatIdListEntries", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                        n3h n3hVarI3 = zjk.i(lzeVar, "chatIdListEntries");
                        if (n3hVar3.equals(n3hVarI3)) {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put("uuid", new k3h(1, 1, "uuid", "TEXT", null, true));
                            linkedHashMap4.put("updated_at", new k3h(0, 1, "updated_at", "INTEGER", null, true));
                            linkedHashMap4.put("project_json", new k3h(0, 1, "project_json", "TEXT", null, true));
                            n3h n3hVar4 = new n3h("cachedProjects", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                            n3h n3hVarI4 = zjk.i(lzeVar, "cachedProjects");
                            if (n3hVar4.equals(n3hVarI4)) {
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap5.put("source", new k3h(1, 1, "source", "TEXT", null, true));
                                linkedHashMap5.put("project_uuid", new k3h(2, 1, "project_uuid", "TEXT", null, true));
                                n3h n3hVar5 = new n3h("projectIdListEntries", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                                n3h n3hVarI5 = zjk.i(lzeVar, "projectIdListEntries");
                                if (!n3hVar5.equals(n3hVarI5)) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new k3h(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap6.put("prerequisite_id", new k3h(2, 1, "prerequisite_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("work_spec_id"), x44.W("id")));
                linkedHashSet3.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("prerequisite_id"), x44.W("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new m3h("index_Dependency_work_spec_id", false, x44.W("work_spec_id"), x44.W("ASC")));
                linkedHashSet4.add(new m3h("index_Dependency_prerequisite_id", false, x44.W("prerequisite_id"), x44.W("ASC")));
                n3h n3hVar6 = new n3h("Dependency", linkedHashMap6, linkedHashSet3, linkedHashSet4);
                n3h n3hVarI6 = zjk.i(lzeVar, "Dependency");
                if (n3hVar6.equals(n3hVarI6)) {
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    linkedHashMap7.put("id", new k3h(1, 1, "id", "TEXT", null, true));
                    linkedHashMap7.put("state", new k3h(0, 1, "state", "INTEGER", null, true));
                    linkedHashMap7.put("worker_class_name", new k3h(0, 1, "worker_class_name", "TEXT", null, true));
                    linkedHashMap7.put("input_merger_class_name", new k3h(0, 1, "input_merger_class_name", "TEXT", null, true));
                    linkedHashMap7.put("input", new k3h(0, 1, "input", "BLOB", null, true));
                    linkedHashMap7.put("output", new k3h(0, 1, "output", "BLOB", null, true));
                    linkedHashMap7.put("initial_delay", new k3h(0, 1, "initial_delay", "INTEGER", null, true));
                    linkedHashMap7.put("interval_duration", new k3h(0, 1, "interval_duration", "INTEGER", null, true));
                    linkedHashMap7.put("flex_duration", new k3h(0, 1, "flex_duration", "INTEGER", null, true));
                    linkedHashMap7.put("run_attempt_count", new k3h(0, 1, "run_attempt_count", "INTEGER", null, true));
                    linkedHashMap7.put("backoff_policy", new k3h(0, 1, "backoff_policy", "INTEGER", null, true));
                    linkedHashMap7.put("backoff_delay_duration", new k3h(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                    linkedHashMap7.put("last_enqueue_time", new k3h(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                    linkedHashMap7.put("minimum_retention_duration", new k3h(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                    linkedHashMap7.put("schedule_requested_at", new k3h(0, 1, "schedule_requested_at", "INTEGER", null, true));
                    linkedHashMap7.put("run_in_foreground", new k3h(0, 1, "run_in_foreground", "INTEGER", null, true));
                    linkedHashMap7.put("out_of_quota_policy", new k3h(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                    linkedHashMap7.put("period_count", new k3h(0, 1, "period_count", "INTEGER", TaskSessionEvent.REPLAY_FROM_START, true));
                    linkedHashMap7.put("generation", new k3h(0, 1, "generation", "INTEGER", TaskSessionEvent.REPLAY_FROM_START, true));
                    linkedHashMap7.put("next_schedule_time_override", new k3h(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                    linkedHashMap7.put("next_schedule_time_override_generation", new k3h(0, 1, "next_schedule_time_override_generation", "INTEGER", TaskSessionEvent.REPLAY_FROM_START, true));
                    linkedHashMap7.put("stop_reason", new k3h(0, 1, "stop_reason", "INTEGER", "-256", true));
                    linkedHashMap7.put("trace_tag", new k3h(0, 1, "trace_tag", "TEXT", null, false));
                    linkedHashMap7.put("backoff_on_system_interruptions", new k3h(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                    linkedHashMap7.put("required_network_type", new k3h(0, 1, "required_network_type", "INTEGER", null, true));
                    linkedHashMap7.put("required_network_request", new k3h(0, 1, "required_network_request", "BLOB", "x''", true));
                    linkedHashMap7.put("requires_charging", new k3h(0, 1, "requires_charging", "INTEGER", null, true));
                    linkedHashMap7.put("requires_device_idle", new k3h(0, 1, "requires_device_idle", "INTEGER", null, true));
                    linkedHashMap7.put("requires_battery_not_low", new k3h(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                    linkedHashMap7.put("requires_storage_not_low", new k3h(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                    linkedHashMap7.put("trigger_content_update_delay", new k3h(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                    linkedHashMap7.put("trigger_max_content_delay", new k3h(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                    linkedHashMap7.put("content_uri_triggers", new k3h(0, 1, "content_uri_triggers", "BLOB", null, true));
                    LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                    LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                    linkedHashSet6.add(new m3h("index_WorkSpec_schedule_requested_at", false, x44.W("schedule_requested_at"), x44.W("ASC")));
                    linkedHashSet6.add(new m3h("index_WorkSpec_last_enqueue_time", false, x44.W("last_enqueue_time"), x44.W("ASC")));
                    n3h n3hVar7 = new n3h("WorkSpec", linkedHashMap7, linkedHashSet5, linkedHashSet6);
                    n3h n3hVarI7 = zjk.i(lzeVar, "WorkSpec");
                    if (n3hVar7.equals(n3hVarI7)) {
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        linkedHashMap8.put("tag", new k3h(1, 1, "tag", "TEXT", null, true));
                        linkedHashMap8.put("work_spec_id", new k3h(2, 1, "work_spec_id", "TEXT", null, true));
                        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                        linkedHashSet7.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("work_spec_id"), x44.W("id")));
                        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                        linkedHashSet8.add(new m3h("index_WorkTag_work_spec_id", false, x44.W("work_spec_id"), x44.W("ASC")));
                        n3h n3hVar8 = new n3h("WorkTag", linkedHashMap8, linkedHashSet7, linkedHashSet8);
                        n3h n3hVarI8 = zjk.i(lzeVar, "WorkTag");
                        if (n3hVar8.equals(n3hVarI8)) {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            linkedHashMap9.put("work_spec_id", new k3h(1, 1, "work_spec_id", "TEXT", null, true));
                            linkedHashMap9.put("generation", new k3h(2, 1, "generation", "INTEGER", TaskSessionEvent.REPLAY_FROM_START, true));
                            linkedHashMap9.put("system_id", new k3h(0, 1, "system_id", "INTEGER", null, true));
                            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                            linkedHashSet9.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("work_spec_id"), x44.W("id")));
                            n3h n3hVar9 = new n3h("SystemIdInfo", linkedHashMap9, linkedHashSet9, new LinkedHashSet());
                            n3h n3hVarI9 = zjk.i(lzeVar, "SystemIdInfo");
                            if (n3hVar9.equals(n3hVarI9)) {
                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                linkedHashMap10.put("name", new k3h(1, 1, "name", "TEXT", null, true));
                                linkedHashMap10.put("work_spec_id", new k3h(2, 1, "work_spec_id", "TEXT", null, true));
                                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                                linkedHashSet10.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("work_spec_id"), x44.W("id")));
                                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                                linkedHashSet11.add(new m3h("index_WorkName_work_spec_id", false, x44.W("work_spec_id"), x44.W("ASC")));
                                n3h n3hVar10 = new n3h("WorkName", linkedHashMap10, linkedHashSet10, linkedHashSet11);
                                n3h n3hVarI10 = zjk.i(lzeVar, "WorkName");
                                if (n3hVar10.equals(n3hVarI10)) {
                                    LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                    linkedHashMap11.put("work_spec_id", new k3h(1, 1, "work_spec_id", "TEXT", null, true));
                                    linkedHashMap11.put("progress", new k3h(0, 1, "progress", "BLOB", null, true));
                                    LinkedHashSet linkedHashSet12 = new LinkedHashSet();
                                    linkedHashSet12.add(new l3h("WorkSpec", "CASCADE", "CASCADE", x44.W("work_spec_id"), x44.W("id")));
                                    n3h n3hVar11 = new n3h("WorkProgress", linkedHashMap11, linkedHashSet12, new LinkedHashSet());
                                    n3h n3hVarI11 = zjk.i(lzeVar, "WorkProgress");
                                    if (n3hVar11.equals(n3hVarI11)) {
                                        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                        linkedHashMap12.put("key", new k3h(1, 1, "key", "TEXT", null, true));
                                        linkedHashMap12.put("long_value", new k3h(0, 1, "long_value", "INTEGER", null, false));
                                        n3h n3hVar12 = new n3h("Preference", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
                                        n3h n3hVarI12 = zjk.i(lzeVar, "Preference");
                                        if (!n3hVar12.equals(n3hVarI12)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return new jf(true, (String) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll3(ClaudeDatabase_Impl claudeDatabase_Impl) {
        super("ececdabd77ce97aad46cb1041bc15fd9", 2, "53192407a3966955228230a78127cab7");
        this.e = claudeDatabase_Impl;
    }
}
