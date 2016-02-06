package com.ullink.slack.simpleslackapi.events;

public enum SlackEventType
{
    SLACK_CHANNEL_ARCHIVED,
    SLACK_CHANNEL_CREATED,
    SLACK_CHANNEL_DELETED,
    SLACK_CHANNEL_RENAMED,
    SLACK_CHANNEL_UNARCHIVED,
    SLACK_GROUP_JOINED,
    SLACK_MESSAGE_DELETED,
    SLACK_MESSAGE_UPDATED,
    SLACK_MESSAGE_POSTED,
    SLACK_REPLY,
    SLACK_CONNECTED,
    REACTION_ADDED,
    REACTION_REMOVED,
    SLACK_USER_CHANGE,
    UNKNOWN;
}
