package sol;

import src.Email;
import src.FuncList;
import src.IFuncList;


/**
 * Class representing utilities that can be used to work with an inbox of Emails
 */
public class EmailUtilities {

    /**
     * Field representing the inbox (a list of Emails)
     */
    private IFuncList<Email> emails;

    /**
     * Constructor for EmailUtilities
     *
     * @param emails    the list of Emails that represent an inbox
     */
    public EmailUtilities(IFuncList<Email> emails) {
        // Copies over the list of emails
        this.emails = emails;
    }

    /**
     * Method to get all the unread emails in the inbox
     *
     * @return  a List of all Emails in the inbox where the isRead field is false
     */
    public IFuncList<Email> getAllUnread() {
        // TODO: fill out this method!
        return null;
    }

    /**
     * Method that returns all the emails in the inbox, marked as unread
     *
     * @return a List of all Emails from the inbox, but with the isRead field marked as false
     */
    public IFuncList<Email> markAsUnread() {
        // TODO: fill out this method!
        return null;
    }

    /**
     * Method that returns all the unread Emails in the inbox from a specific sender
     *
     * @param sender    the email address of the sender
     * @return          a List of all unread Emails in the inbox that are from the sender
     */
    public IFuncList<Email> unreadMessagesFrom(String sender) {
        // TODO: fill out this method!
        return null;
    }

    /**
     * Method that returns all the Emails in the inbox about a specific topic
     *
     * @param topic the topic to search for
     * @return      a List of all the Emails from the inbox where the message text contains the topic as a substring
     */
    public IFuncList<Email> messagesAbout(String topic) {
        // TODO: fill out this method!
        return null;
    }

    /**
     * Method that returns all the usernames of senders from which unread emails exist in the inbox
     * A username is the portion of the email address that comes before the "@"
     *
     * @return  a List of all the distinct usernames from which unread emails exist in the inbox
     */
    public IFuncList<String> unreadFrom() {
        // TODO: fill out this method!
        return null;
    }
}
